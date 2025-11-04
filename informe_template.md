Laboratorio N°12 – Pruebas Unitarias (Calculadora Científica)
Alumno: [NOMBRE_APELLIDO]
Código: [CÓDIGO]
Curso: Construcción y Pruebas de Software – IV Ciclo
Fecha: [FECHA]

Resumen
-------
Implementé una calculadora científica en Java y verifiqué su comportamiento con pruebas unitarias en JUnit 5 bajo Maven.

Entorno y comandos
------------------
Java: [version Java]
Maven: [version Maven]
Comandos ejecutados:
- mvn clean compile
- mvn test

Evidencias (pegar capturas)
---------------------------
- 01_mvn_test_initial.png -> salida de mvn test inicial (descarga dependencias o BUILD SUCCESS)
- 02_mvn_compile.png -> salida de mvn clean compile
- 03_mvn_test_all_pass.png -> salida final de mvn test con tests pasados
- 04_test_failure.png -> (si aplica) captura del fallo
- 05_after_fix_success.png -> captura final tras corrección

Código implementado
-------------------
Archivos y rutas:
- src/main/java/com/escuela/calculadora/CalculadoraCientifica.java
- src/test/java/com/escuela/calculadora/CalculadoraCientificaTest.java

Casos de prueba ejecutados (tabla)
---------------------------------
Nombre de la prueba | Qué verifica | Resultado esperado | Resultado obtenido
testSumar | Suma de 3 y 4 | 7.0 | [PASÓ]
testDividir | División por 0 | Lanza IllegalArgumentException | [PASÓ]
... (completar con todas las pruebas)

Casos fallidos y diagnóstico
----------------------------
- Si hubo fallos, describir el test, el mensaje de error y la corrección aplicada.

Mejoras aplicadas y sugerencias
-------------------------------
- Ejemplo: añadir más casos límite, parametrizar tests, usar constantes para tolerancia.

Conclusión
----------
Breve conclusión sobre lo aprendido y la importancia de las pruebas unitarias.
