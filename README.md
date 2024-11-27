# SmartsHead Plugin

Este plugin proporciona una función para generar cabezas personalizadas en Minecraft utilizando texturas codificadas en Base64. Se puede usar como una dependencia en otros plugins de Minecraft.

## Funciones

- **Generar una cabeza personalizada**: El método `getCustomHead(String base64)` crea un `ItemStack` de tipo `PLAYER_HEAD` con una textura personalizada proporcionada en formato Base64.

## Incluirlo como Dependencia

### Usando Gradle

Para incluir este plugin como dependencia en tu proyecto, simplemente agrega la siguiente configuración en el archivo `build.gradle`:

```gradle
repositories {
    mavenCentral()
    maven {
        url = 'https://repo.papermc.io/repository/maven-public/'
    }
    // Agrega el repositorio de GitHub si lo has publicado ahí
    maven {
        url = uri("https://maven.pkg.github.com/your-github-username/your-repository")
    }
}

dependencies {
    compileOnly 'dev.smarts:SmartsHead:1.0'
}
