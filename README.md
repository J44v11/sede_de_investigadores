# SedeDeInvestigadores

![Java](https://img.shields.io/badge/Java-11%2B-blue) ![GitHub Repo](https://img.shields.io/badge/Repo-J44v11%2Fsede_de_investigadores-green)

Proyecto de práctica sobre herencia, polimorfismo, interfaces, arrays y `ArrayList` con una sede de investigadores organizada por tipos de científico.

## Tabla de contenidos

- [Descripción](#descripción)
- [Estructura](#estructura)
- [Requisitos](#requisitos)
- [Extensiones recomendadas (VS Code)](#extensiones-recomendadas-vs-code)
- [Clonar el proyecto](#clonar-el-proyecto)
- [Ejecutar la aplicación](#ejecutar-la-aplicación)
- [Funcionamiento](#funcionamiento)

***

## Descripción

La aplicación modela una sede de investigadores con una clase abstracta base y tres tipos concretos:

- `Investigador`: clase abstracta con los atributos comunes `nombre`, `especialidad` y `sueldo`.
- `Matematico`: trabaja con matrices y realiza operaciones sobre ellas.
- `Biologo`: gestiona una lista variable de especímenes en investigación.
- `Quimico`: gestiona una lista de elementos de reacción y comparte parte del comportamiento con el biólogo mediante una interfaz de trabajo dual.

El punto de entrada del programa es la clase `App` en [src/App.java](src/App.java).

## Estructura

```text
sede_de_investigadores/
├─ src/
│  ├─ App.java
│  └─ net/
│     └─ salesianos/
│        ├─ investigadores/
│        │  ├─ Biologo.java
│        │  ├─ Investigador.java
│        │  ├─ Matematico.java
│        │  └─ Quimico.java
│        └─ trabajodual/
│           └─ TrabajoDual.java
├─ bin/   (salida de compilación)
└─ README.md
```

## Requisitos

- Java JDK 11 o superior.
- Git, si vas a clonar el repositorio.

## Extensiones recomendadas (VS Code)

Para trabajar cómodamente con el proyecto en VS Code, se recomiendan estas extensiones:

- `Extension Pack for Java` (Microsoft) — herramientas básicas para Java.
- `Language Support for Java(TM) by Red Hat` — soporte de lenguaje y autocompletado.
- `Debugger for Java` (Microsoft) — depuración integrada.
- `Java Test Runner` (Microsoft) — ejecución de tests con JUnit.

## Clonar el proyecto

En una terminal, sitúate en la carpeta donde quieras guardar el proyecto y ejecuta:

```bash
git clone https://github.com/J44v11/sede_de_investigadores.git
cd sede_de_investigadores
```

Si vas a trabajar desde la línea de comandos, entra en la carpeta `src` para compilar o ejecutar los fuentes:

```bash
cd src
```

## Ejecutar la aplicación

La aplicación se puede lanzar directamente desde la carpeta `src`:

```bash
cd src
java App.java
```

## Funcionamiento

Al arrancar, la aplicación muestra un menú principal para elegir entre los tres tipos de investigador:

1. Matemático.
2. Biólogo.
3. Químico.

Cada investigador tiene su propio menú con opciones específicas y métodos comunes:

- Identificación.
- Cálculo básico: suma y resta de dos valores.
- Estado del sueldo.
- Trabajo específico según el tipo de investigador.

### Matemático

- Trabaja con una matriz inicial.
- Puede multiplicar la matriz por un número.
- Puede sumar una matriz `3x3` introducida por teclado.
- Muestra el estado de su sueldo según la regla definida en la clase.

### Biólogo

- Gestiona una lista variable de especímenes.
- Puede añadir especímenes a la lista.
- Al trabajar, ordena por longitud y elimina el elemento de mayor tamaño.
- Su estado del sueldo avisa si está por debajo del mínimo establecido.

### Químico

- Gestiona una lista variable de elementos de reacción.
- Puede añadir elementos a la lista.
- Al trabajar, invierte la lista para mezclar las posiciones.
- Su estado del sueldo avisa si está por debajo del mínimo establecido.

### Trabajo dual

La interfaz `TrabajoDual` define un comportamiento compartido entre biólogos y químicos:

- El biólogo, en trabajo dual, invierte la lista.
- El químico, en trabajo dual, ordena por longitud y elimina el elemento más largo.

## Nota sobre el proyecto

El programa incluye control de errores con `try`, `catch` y `finally` para gestionar entradas numéricas incorrectas en el menú principal.
