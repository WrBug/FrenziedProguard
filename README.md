# 丧心病狂的Android混淆文件生成器


## 效果

混淆前

![](/1.png)

混淆后

![](/luyten.png)

![](/jd.png)

## 使用

### 获取混淆文件

#### 自己生成规则

使用intellij idea 打开 [proguard-creater](/proguard-creater) 工程
编辑 Main.java 根据提示填写相应参数运行即可


#### 使用已有规则

前往[proguard-file](/proguard-file) 下载对应的文件即可


### Android工程配置

    
1.  开启混淆
    
```
    
   buildTypes {
   release {
       minifyEnabled true
       proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
   }
}
    
```
2.  将混淆文件导入到 *proguard-rules.pro* 同一目录下
3. 编辑*proguard-rules.pro*,添加如下内容

```
# ----------------------------------------------------------------------------
# 混淆的压缩比例，0-7
-optimizationpasses 5
# 指定不去忽略非公共的库的类的成员
-dontskipnonpubliclibraryclassmembers
# 指定混淆是采用的算法
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*
# 指定外部模糊字典 proguard-chinese.txt 改为混淆文件名，下同
-obfuscationdictionary proguard-chinese.txt
# 指定class模糊字典
-classobfuscationdictionary proguard-chinese.txt
# 指定package模糊字典
-packageobfuscationdictionary proguard-chinese.txt

```

更多精彩内容请关注博客：[https://www.wrbug.com](https://www.wrbug.com)
