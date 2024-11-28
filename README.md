# SmartsHead Plugin

The **SmartsHead Library** provides a utility to generate custom player heads in Minecraft using Base64-encoded textures. It can be integrated as a dependency into other Minecraft plugins.

## Features

- **Generate custom player heads**: The `getCustomHead(String base64)` method creates an `ItemStack` of type `PLAYER_HEAD` with a custom texture provided in Base64 format.

## How to Use

### Using Gradle

To include this plugin as a dependency in your project using **Gradle**, add the following configuration to your `build.gradle` file:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ImTheyyyyy:SmartsHead:v1.0.0'
}
```

### Using Maven

To include this plugin as a dependency in your project using **Maven**, add the following configuration to your `pom.xml` file:

```maven
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.ImTheyyyyy</groupId>
        <artifactId>SmartsHead</artifactId>
        <version>v1.0.0</version>
    </dependency>
</dependencies>
```

### Example Usage

Here’s an example of how to use the **getCustomHead** method in your plugin:

```java
import dev.smart.SmartsHead;
import org.bukkit.inventory.ItemStack;

public class ExamplePlugin {
  public ItemStack createCustomHead() {
    String base64Texture = "your-base64-encoded-texture";
    return SmartsHead.getCustomHead(base64Texture);
  }
}
```

