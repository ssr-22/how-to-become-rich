# how-to-become-rich

This is tutorial about how to publish a Maven artifact to Github!
https://www.liaoxuefeng.com/wiki/1252599548343744/1347981037010977

### Usage

Add the following to `pom.xml`:

```
<project ...>
    <repositories>
       <repository>
            <id>github-rich-repo</id>
            <name>The Rich Repository on Github</name>
            <url>https://github.com/ssr-22/how-to-become-rich/maven-repo/</url>
       </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>org.shen</groupId>
            <artifactId>how-to-become-rich</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
<project>
```

### Sample code

```
Millionaire millionaire=new Millionaire("");
System.out.println(millionaire.howTobecomeRich());
```