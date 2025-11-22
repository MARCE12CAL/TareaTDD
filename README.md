# Kata de Números Romanos - TDD con Java y JUnit 5

## Estructura del Proyecto

```
roman-numerals-kata/
├── pom.xml
├── README.md
├── INSTRUCCIONES.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── manus/
    │               └── RomanNumeralsConverter.java
    └── test/
        └── java/
            └── com/
                └── manus/
                    └── RomanNumeralsConverterTest.java
```

## Requisitos Previos

- Java 8 o superior
- Maven 3.6 o superior

## Cómo Empezar

### 1. Descomprimir el archivo ZIP

Extrae el contenido del ZIP en tu ubicación preferida.

### 2. Abrir el proyecto

Abre la carpeta `roman-numerals-kata` en tu IDE favorito (VS Code, IntelliJ IDEA, Eclipse).

### 3. Compilar y ejecutar los tests

Abre una terminal en la raíz del proyecto y ejecuta:

```bash
mvn clean test
```

Deberías ver:

```
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Objetivo de la Kata

Implementar un conversor de números arábigos (1, 2, 3...) a números romanos (I, II, III...) siguiendo la metodología TDD.

## Reglas de Números Romanos

| Número | Romano |
|--------|--------|
| 1      | I      |
| 4      | IV     |
| 5      | V      |
| 9      | IX     |
| 10     | X      |
| 40     | XL     |
| 50     | L      |
| 90     | XC     |
| 100    | C      |
| 400    | CD     |
| 500    | D      |
| 900    | CM     |
| 1000   | M      |

## Metodología TDD

Sigue el ciclo **Red-Green-Refactor**:

1. **RED** 🔴: Escribe un test que falle
2. **GREEN** 🟢: Escribe el código mínimo para que pase
3. **REFACTOR** 🔵: Mejora el código sin cambiar su comportamiento

## Próximos Pasos

Lee el archivo `INSTRUCCIONES.md` para el paso a paso completo de la kata.

## Comandos Útiles

```bash
# Compilar el proyecto
mvn compile

# Ejecutar los tests
mvn test

# Limpiar y ejecutar tests
mvn clean test

# Limpiar el proyecto
mvn clean
```

## Ayuda

Si tienes problemas:

1. Verifica que tienes Java y Maven instalados:
   ```bash
   java -version
   mvn -version
   ```

2. Asegúrate de estar en la raíz del proyecto (donde está el `pom.xml`)

3. Si Maven no descarga las dependencias, ejecuta:
   ```bash
   mvn dependency:resolve
   ```
