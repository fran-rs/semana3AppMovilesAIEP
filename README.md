# semana3AppMovilesAIEP
# Proyecto Distribuidora de Alimentos. 

Este proyecto corresponde a una aplicación básica en **Java**, compilada y ejecutada desde la línea de comandos, sin utilizar un IDE.
La aplicación permite ingresar datos de un vehículo (marca, modelo, cilindrada,combustible y capacidad de pasajeros) y mostrar en consola la información registrada.
---
## Requerimientos del Proyecto.

### Funcionales.
1. Permitir al usuario ingresar los datos de un vehículo.
2. Mostrar en consola los datos ingresados.
3. Calcular el costo de despacho según reglas de negocio:
    - Compras > = 50.000 -> Despacho gratis (máximo 20 Kilómetro).
    - Compras entre 25.000 y 49.000 -> $150 por kilómetro.
    - Compras < 25.000 -> $300 por kilómetro.
4. Registro de usuario mediante cuenta Gmail.

### No Funcionales.
1. Ejecutarse en cualquier dispositivo con **Java SE 8+**.
2. Ser compilado desde consola (`javac`).
3. Documentación completa en GitHub.
4. Aplicación simple y entendible para usuarios.

---
## Instalación y Ejecución

### 1. Verificar instalación de Java
```bash
java -version
javac -version
