# Smart Alarm Clock (Java)

## 📌 Descripción del proyecto

Este proyecto implementa la lógica de un despertador inteligente similar al de un smartphone moderno, desarrollado completamente en Java sin interfaz gráfica.

El sistema permite gestionar múltiples alarmas con funcionalidades avanzadas como repetición semanal, control de sonido, snooze, detección de conflictos y retos matemáticos para desactivar alarmas.

---

## 🎯 Objetivos

- Diseñar un sistema orientado a objetos realista.
- Implementar lógica de negocio desacoplada de interfaz gráfica.
- Aplicar principios SOLID básicos.
- Gestionar un proyecto con Git y GitHub.
- Documentar técnicamente el sistema.
- Utilizar IA de forma responsable en el desarrollo.

---

## 🧠 Funcionalidades principales

- Crear alarmas
- Eliminar alarmas
- Activar / desactivar alarmas
- Configurar hora y etiqueta
- Repetición semanal
- Configuración de sonido y volumen
- Posponer alarmas (snooze)
- Detener alarmas
- Consultar próximas alarmas

---

## 🚀 Funcionalidades avanzadas

- 🧘 Modo circadiano (aumento progresivo del volumen)
- ⚠️ Detector de conflictos entre alarmas cercanas
- 🧮 Reto matemático para desactivar alarmas

---

## 🏗️ Estructura del proyecto

```
src/
 ├── model/
 │    ├── Alarm.java
 │    ├── SoundProfile.java
 │
 ├── service/
 │    ├── AlarmManager.java
 │    ├── Scheduler.java
 │    ├── SnoozeManager.java
 │    ├── ConflictDetector.java
 │    ├── MathChallenge.java
 │
 └── Main.java

docs/
 ├── analysis.md
 ├── class-diagram.md
```

---

## 🛠️ Tecnologías utilizadas

- Java
- Git / GitHub
- UML (Mermaid)

---

## ▶️ Ejecución

1. Compilar el proyecto en Java
2. Ejecutar la clase `Main`

---

## 📊 Diseño orientado a objetos

El sistema está dividido en:

- **Modelos:** Alarm, SoundProfile
- **Servicios:** lógica del sistema (Scheduler, Manager, etc.)

Esto permite separación de responsabilidades y escalabilidad.

---

## 🧠 Decisiones de diseño

- Se utiliza `Set<DayOfWeek>` para repetición semanal.
- `AlarmManager` centraliza la gestión de alarmas.
- `Scheduler` controla la ejecución del sistema.
- `MathChallenge` añade interacción lógica antes de apagar alarmas.

---

## 🤖 Uso de IA

La inteligencia artificial ha sido utilizada para:

- Generación de estructuras iniciales de clases.
- Diseño de arquitectura del sistema.
- Revisión de código y optimización.

Todo el código ha sido revisado y adaptado manualmente.

---

## 📌 Autor

Proyecto desarrollado como práctica de programación orientada a objetos en Java.

## 📋 Autoevaluación

| Criterio | Peso | Nota (0-10) | Nota ponderada |
|---|---|---|---|
| Diseño orientado a objetos | 25% | 9 | 2,25 |
| Calidad del código | 20% | 9 | 1,80 |
| Uso correcto de Git/GitHub | 15% | 9 | 1,35 |
| Diagramas UML | 15% | 9 | 1,35 |
| Especificación de casos de uso | 10% | 9 | 0,90 |
| Documentación README | 10% | 9 | 0,90 |
| Reflexión sobre IA | 5% | 9 | 0,45 |
| **TOTAL** | **100%** | — | **9,00** |
