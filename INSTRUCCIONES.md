# Instrucciones Paso a Paso - Kata de Números Romanos

## PASO 1: Verificar que el primer test pasa 

Ya tienes un test implementado para convertir 1 a I.

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:**  Tests run: 1, Failures: 0

---

## PASO 2: RED - Agregar test para el número 2

Abre `src/test/java/com/manus/RomanNumeralsConverterTest.java` y agrega:

```java
@Test
void shouldConvert2ToII() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("II", converter.convert(2));
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:** ❌ El test falla (expected: <II> but was: <>)

---

## PASO 3: GREEN - Implementar solución para el 2

Abre `src/main/java/com/manus/RomanNumeralsConverter.java` y modifica el método `convert`:

```java
public String convert(int number) {
    String result = "";
    for (int i = 0; i < number; i++) {
        result += "I";
    }
    return result;
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:**  Tests run: 2, Failures: 0

---

## PASO 4: RED - Agregar test para el número 3

Agrega en el archivo de test:

```java
@Test
void shouldConvert3ToIII() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("III", converter.convert(3));
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:**  Tests run: 3, Failures: 0 (ya funciona con la implementación actual)

---

## PASO 5: RED - Agregar test para el número 5

Agrega en el archivo de test:

```java
@Test
void shouldConvert5ToV() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("V", converter.convert(5));
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:** ❌ El test falla (expected: <V> but was: <IIIII>)

---

## PASO 6: GREEN - Implementar solución para el 5

Modifica el método `convert`:

```java
public String convert(int number) {
    if (number >= 5) {
        return "V" + convert(number - 5);
    }
    String result = "";
    for (int i = 0; i < number; i++) {
        result += "I";
    }
    return result;
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:** ✅ Tests run: 4, Failures: 0

---

## PASO 7: RED - Agregar test para el número 4 (regla de resta)

Agrega en el archivo de test:

```java
@Test
void shouldConvert4ToIV() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("IV", converter.convert(4));
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:** ❌ El test falla (expected: <IV> but was: <IIII>)

---

## PASO 8: GREEN - Implementar solución para el 4

Modifica el método `convert`:

```java
public String convert(int number) {
    if (number >= 5) {
        return "V" + convert(number - 5);
    }
    if (number >= 4) {
        return "IV" + convert(number - 4);
    }
    String result = "";
    for (int i = 0; i < number; i++) {
        result += "I";
    }
    return result;
}
```

**Ejecuta:**
```bash
mvn test
```

**Resultado esperado:** ✅ Tests run: 5, Failures: 0

---

## PASO 9: Continúa con más números

Sigue el mismo patrón TDD para implementar:

### Tests a agregar:

```java
@Test
void shouldConvert6ToVI() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("VI", converter.convert(6));
}

@Test
void shouldConvert9ToIX() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("IX", converter.convert(9));
}

@Test
void shouldConvert10ToX() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("X", converter.convert(10));
}

@Test
void shouldConvert40ToXL() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("XL", converter.convert(40));
}

@Test
void shouldConvert50ToL() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("L", converter.convert(50));
}

@Test
void shouldConvert90ToXC() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("XC", converter.convert(90));
}

@Test
void shouldConvert100ToC() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("C", converter.convert(100));
}

@Test
void shouldConvert400ToCD() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("CD", converter.convert(400));
}

@Test
void shouldConvert500ToD() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("D", converter.convert(500));
}

@Test
void shouldConvert900ToCM() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("CM", converter.convert(900));
}

@Test
void shouldConvert1000ToM() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("M", converter.convert(1000));
}

@Test
void shouldConvert1984ToMCMLXXXIV() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("MCMLXXXIV", converter.convert(1984));
}

@Test
void shouldConvert3999ToMMMCMXCIX() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("MMMCMXCIX", converter.convert(3999));
}
```

---

## SOLUCIÓN COMPLETA (¡No mires hasta intentarlo!)

<details>
<summary>Click aquí para ver la implementación completa</summary>

```java
package com.manus;

public class RomanNumeralsConverter {
    
    public String convert(int number) {
        if (number >= 1000) {
            return "M" + convert(number - 1000);
        }
        if (number >= 900) {
            return "CM" + convert(number - 900);
        }
        if (number >= 500) {
            return "D" + convert(number - 500);
        }
        if (number >= 400) {
            return "CD" + convert(number - 400);
        }
        if (number >= 100) {
            return "C" + convert(number - 100);
        }
        if (number >= 90) {
            return "XC" + convert(number - 90);
        }
        if (number >= 50) {
            return "L" + convert(number - 50);
        }
        if (number >= 40) {
            return "XL" + convert(number - 40);
        }
        if (number >= 10) {
            return "X" + convert(number - 10);
        }
        if (number >= 9) {
            return "IX" + convert(number - 9);
        }
        if (number >= 5) {
            return "V" + convert(number - 5);
        }
        if (number >= 4) {
            return "IV" + convert(number - 4);
        }
        
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
}
```

</details>

---

## Recordatorio del Ciclo TDD

1. **RED** 🔴: Escribe un test que falle
2. **GREEN** 🟢: Escribe el código mínimo para que pase
3. **REFACTOR** 🔵: Mejora el código (opcional)
4. **Repite**

## Tips

- Siempre ejecuta `mvn test` después de cada cambio
- No escribas más código del necesario para pasar el test
- Los tests deben ser independientes entre sí
- Sigue el orden: primero el test, luego la implementación


