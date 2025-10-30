# ☕ Sistema de Gestión de Inventario en Java

Este proyecto es una aplicación de consola desarrollada en Java que simula un sistema básico de gestión de inventario. El objetivo principal es aplicar y demostrar de forma práctica los pilares de la **Programación Orientada a Objetos (POO)**.

Este repositorio fue creado como parte de mi portfolio de desarrollo para demostrar mis habilidades en Java y POO.

---

## 🚀 Características Principales

* **Gestión de Productos:** Permite agregar, buscar y listar productos.
* **Lógica de Negocio:** Valida el stock disponible antes de realizar una venta y permite la reposición de stock.
* **Clasificación de Productos:** Maneja diferentes categorías de productos (Alimenticios, Electrónicos) con atributos y comportamientos específicos.

---

## 🛠️ Conceptos de POO Aplicados

Esta fue la parte central del proyecto. Me enfoqué en aplicar los siguientes conceptos:

### 1. Encapsulamiento
* Los atributos de las clases (como `precio` o `cantidadStock`) están declarados como `private`.
* El acceso y la modificación se controlan a través de métodos públicos (`getters` y `setters`).
* **Importante:** Se protegió la lógica de negocio. Por ejemplo, no existe un `setStock()`. En su lugar, se deben usar los métodos `vender(cantidad)` y `reponerStock(cantidad)`, que contienen las validaciones necesarias.

### 2. Herencia
* Se creó una clase base `Producto` que contiene los atributos y métodos comunes a todos los productos.
* Las clases `ProductoElectronico` y `ProductoAlimenticio` **heredan** de `Producto`, reutilizando código y añadiendo sus propios atributos (como `mesesGarantia` o `fechaVencimiento`).

### 3. Polimorfismo
* Se utilizó la sobrescritura de métodos (`@Override`). El método `mostrarDetalle()` se define en la clase `Producto` y se redefine en las clases hijas para mostrar su información específica.
* **Polimorfismo en colecciones:** La clase `Inventario` utiliza una `List<Producto>`. Esta lista puede almacenar objetos de tipo `Producto`, `ProductoElectronico` y `ProductoAlimenticio` indistintamente. Al iterar sobre la lista y llamar a `producto.mostrarDetalle()`, Java ejecuta automáticamente la versión correcta del método según el tipo real del objeto.

### 4. Abstracción
* La clase `Producto` actúa como una abstracción de alto nivel de lo que es un ítem almacenable, definiendo la interfaz común para todos los productos del inventario.

---

## 💻 Tecnologías Utilizadas

* **Java (JDK 17+)**
* **Visual Studio Code**
* **Git y GitHub**
