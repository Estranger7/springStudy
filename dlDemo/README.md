## ApplicationContext和BeanFactory的关系
ApplicationContext是BeanFactory的子接口，包含了BeanFactory的所有功能，并且还扩展了一些特性。例如：
- Aop的支持(`AnnotationAwareAspectJAutoProxyCreator`作用于 Bean 的初始化之后)
- 配置元信息（ `BeanDefinition` 、`Environment` 、注解等 ）
- 资源管理（ Resource 抽象 ）
- 事件驱动机制（ ApplicationEvent 、ApplicationListener ）
- 消息与国际化（ LocaleResolver ）
- Environment 抽象（ SpringFramework 3.1 以后）

1. `getBeansWithAnnotation`方法：可以传入一个注解的class，返回所有被这个注解标注的bean。例如自定义一个注解@Color，
使用这个方法就可以获取到所有标注了这个注解的bean。
2. `getBeanDefinitionNames`方法：获取当前容器中的所有的bean(获取到的是一个beanId的数组集合)
3. `getBeanProvider`方法：延迟查找bean，获取一个容器中不存在的bean时，用这个方法不会报错
```
ApplicationContext ctx = new ClassPathXmlApplicationContext("xxx.xml");
ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);

//如果获取不到dog实例，则new一个
Dog dog = dogProvider.getIfAvailble(Dog::new);
//bean存在时执行Consumer接口的方法
dogProvider.ifAvailable(dog -> System.out.println(dog));
```