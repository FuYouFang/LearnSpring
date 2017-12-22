# LearnSpring

### Chapter 2

#### 问题
1. 数据库并没有真正的插入数据，不知道原因
1. 在标注 @Controller 和 @RestController 上有什么区别
1. 在测试框架中不能修改和插入数据，但是在运行中可以，是什么原因

#### 其他知识
1. [jetty 的使用](http://wiki.jikexueyuan.com/project/gradle/jetty-package.html)


### chapter3

#### 问题
1. 项目的 gradle 无法运行

### chapter4
#### 问题
1. p82 强行装置已经存在的类，是什么意思？
1. p84 JVM的安全管理器是什么意思
1. p86 LDAP 是什么
1. p88 Ant 风格是是什么
1. p90 发布时，如果资源配置文件被打到 JAR 中，这是 getFile 就如无法读取了。原因是什么。
1. p56 在 build.gradle 中的中心仓库是什么作用，图书
1. p61 数据库初始化方式 DDL 脚本/DML 脚本 的用处
1. JNDI 的使用

### chapter5
#### 问题
1. 书中 p148 Porlet 应用环境是什么？
1. 代码 resources 中 com.fuyoufang.attr5_4.beans.xml 中 PropertyPathFactoryBean，MethodInvokingFactoryBean，FieldRetrievingFactoryBean 的用法，书中没有找到对应的讲解。
1. 代码 resources 中 com.fuyoufang.attr5_4.beans.xml 中 FieldRetrievingFactoryBean 中的示例无法运行  
1. 代码 anno5_10 中 aspectj 相关的代码有错误
#### 未完成
1. 没有阅读 5.12 和 5.13 章节的内容

#### 其他知识
1. 代码 resources 中 com.fuyoufang.attr5_4_8.beans.xml 中 autowire-candidate 未讲解应该如何使用。他可以指定在自动装配的时候，如果有多个类型相符，可以排除掉不想要的。


### chapter6
#### 问题
1. ToStringBuilder 的用法

```
import org.apache.commons.lang.builder.ToStringBuilder;
ToStringBuilder.reflectionToString(Object);
```
1. p195 PropertyPlaceholderConfigurer 继承自 PropertyResourceConfigurer，PropertyResourceConfigurer的作用是什么？
1. P196 学些 DES 算法的具体实现，代码placeholder6_3_2。（每次运行的结果都不一样）   
1. p212 中对 ResolvableType 的学习

#### 未完成
1. 没有阅读 6.5 国际化信息的内容

### chapter7
#### 问题
1. p247 中学习 Class 的 isAssignableFrom 的用法
```
public native boolean isAssignableFrom(Class<?> cls);
```
1. p253 动态切面代码中，在创建代理的时候调用静态检查有什么用呢？

#### 未完成
1. aop7_5_4 的实例没有写代码

### 书中发现的错误
1. p81 代码清单4-11 代码中空格
1. p94 应该位 car1
1. P109 对代码的描述错误
1. p121 图 5-2 Bean 的定义中 "Foo" 应该为 "foo"
1. p122 "至于 Bean 中是否有对应的属相成员变更则不做要求" 中"变更"应该为"变量"
1. p126 "它们都有两个入参" 应该为 "它们都有三个入参"
1. p132 "parent：容器中的Bean" 应该为 "parent：父容器中的Bean" 
1. p133 5.4.3 内部 Bean，在代码中 BeanAttrDITest.testBeanRetrieveBoss() 测试不通过
1. 在代码中 BeanAttrDITest.testBeanRetrieveBoss3() 测试不通过
1. 在代码中 Chapter5 com.smart.conf.DaoConfig 中 bean 的名称不能为空
1. 在代码中 Chapter5 resources/com/smart/tagdepend/beans.xml 中 "<bean>的信赖" 应该为 "<bean>的依赖"
1. p231 图 7-4 增强接口继承关系图 中 IntroductionInterceptor 为 spring 的接口，图书中标错。
1. p241 "如果没有对 ControllablePerformanceMonitor 进行线程安全的特殊处理，就必须将 singleton 属性设置为 true" 中，"true" 应该为 "false"
1. p250 在 "示例1" 中：".*set.* 表示所有类中以 set 为前缀的方法" 应该改为 ".*set.* 表示所有类中包含 set 字符串的方法"
1. p250 在 "示例4" 中："且这些方法位于 com.smart.service 包中以 Service 为后缀的类中"，这句话应该删除。
1. p257 "ComposablePointcut 没有提供直接对两个切点进行交并集运算的方法" 中 "交并集运算" 应该改成 "并集运算"，因为已经提供了交集运算的方法。 
1. p257 代码清单 7-37 GreetingComposablePointcut 中 "return cp.intersection(pt1).intersection(pt2);" 应该为 "return cp.intersection(pt1).intersection((Pointcut)pt2);"，此处需要对 pt2 进行强转
1. p257 代码清单 7-38 配置复合切点切面 中 "p:pointcut-="#{gcp.intersectionPointcut}"/>" 多了一个"-"，应该为"p:pointcut="#{gcp.intersectionPointcut}"/>"
1. p262 最后一行中 "则非私有实例方法" 应该为 "且非私有实例方法" （"则"->"且"）
