# 前言

#### 00基础

- 抽象
- 封装
- 多态
- 继承

#### 00原则

- 封装变化
- 多用组合，少用继承
- 针对接口编程，不要针对实现编程

#### 00 模式

- 策略模式（Strategy Pattern）

# DesignPatterns

## 单例模式

Singleton Pattern，单例设计模式，即某个类在整个系统中只能有一个实例对象可以被获取和使用。如：

- 代表 JVM 运行环境的 Runtime 类；

### 1. 要点

- 只能有一个实例；--> 构造器私有化
- 必须自行创建这个实例； --> 含有该类是静态变量来保存这个唯一的实例
- 必须向整个系统提供这个实例 --> 对外提供获取该实例对象的方式（直接暴露 或 使用静态的 getter 方法）

### 2. 实现

#### （1）饿汉式：直接创建对象

因为 Java 类加载机制避免了线程安全问题，从而保证了使用饿汉式的单例模式不存在线程安全问题。具体实现如下：

- 直接实例化（PlainSingleton）
- 使用枚举（EnumSingleton）
- 静态代码块（StaticBlockSingleton）

#### （2）懒汉式：延迟创建对象

- 单线程下的懒汉式（UnsafeSingleton），并发环境下存在线程安全问题
- 线程安全（SafeSingleton），使用 DCL + synchronized + volatile
- 静态内部类（StaticInnerClassSingleton）

### 3. There are no dumb questions

**问：为什么不用全局变量来实现“只存在一个实例”呢？**

## 策略模式（Strategy Pattern）

策略模式定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立与使用算法的客户。