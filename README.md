# Android Sample Project

## 技术

架构：MVVM + LiveData + Databinding
 
数据库： Room

网络请求： Retrofit + LiveData

语言：Kotlin

图片加载：Glide

日志： Timber


## 目录结构
```
.
├── AndroidSampleProject.iml
├── app
│   ├── app.iml
│   ├── build.gradle
│   ├── libs
│   ├── proguard-rules.pro
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── com
│       │           └── xinx
│       │               └── sample
│       │                   └── ExampleInstrumentedTest.kt
│       ├── debug
│       │   └── java
│       │       └── com
│       │           └── xinx
│       │               └── sample
│       │                   └── testing
│       │                       └── OpenForTesting.kt
│       ├── main
│       │   ├── AndroidManifest.xml
│       │   ├── java
│       │   │   └── com
│       │   │       └── xinx
│       │   │           └── sample
│       │   │               ├── MainActivity.kt
│       │   │               ├── MainApplication.kt
│       │   │               ├── api
│       │   │               │   ├── ApiResponse.kt
│       │   │               │   ├── LiveDataCallAdapter.kt
│       │   │               │   ├── LiveDataCallAdapterFactory.kt
│       │   │               │   ├── LoginService.kt
│       │   │               │   ├── Response.kt
│       │   │               │   └── ServiceFactory.kt
│       │   │               ├── binding
│       │   │               │   └── BindingAdapters.kt
│       │   │               ├── com
│       │   │               │   └── xinx
│       │   │               │       └── sample
│       │   │               │           └── repo
│       │   │               │               └── Repository.kt
│       │   │               ├── db
│       │   │               │   ├── SampleDb.kt
│       │   │               │   └── UserDao.kt
│       │   │               ├── model
│       │   │               │   └── User.kt
│       │   │               ├── ui
│       │   │               │   ├── common
│       │   │               │   └── login
│       │   │               │       ├── LoginFragment.kt
│       │   │               │       └── LoginViewModel.kt
│       │   │               └── utils
│       │   │                   └── AppExecutors.kt
│       │   └── res
│       │       ├── drawable
│       │       │   └── ic_launcher_background.xml
│       │       ├── drawable-v24
│       │       │   └── ic_launcher_foreground.xml
│       │       ├── layout
│       │       │   └── activity_main.xml
│       │       ├── mipmap-anydpi-v26
│       │       │   ├── ic_launcher.xml
│       │       │   └── ic_launcher_round.xml
│       │       ├── mipmap-hdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-mdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xxhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       ├── mipmap-xxxhdpi
│       │       │   ├── ic_launcher.png
│       │       │   └── ic_launcher_round.png
│       │       └── values
│       │           ├── colors.xml
│       │           ├── strings.xml
│       │           └── styles.xml
│       ├── release
│       │   └── java
│       │       └── com
│       │           └── xinx
│       │               └── sample
│       │                   └── testing
│       │                       └── OpenForTesting.kt
│       └── test
│           └── java
│               └── com
│                   └── xinx
│                       └── sample
│                           └── ExampleUnitTest.kt
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── local.properties
├── settings.gradle
└── versions.gradle
```