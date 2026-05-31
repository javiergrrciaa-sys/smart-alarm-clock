# Diagrama de Casos de Uso - Smart Alarm Clock

```mermaid
usecaseDiagram

actor Usuario

Usuario --> (Crear alarma)
Usuario --> (Eliminar alarma)
Usuario --> (Activar alarma)
Usuario --> (Desactivar alarma)
Usuario --> (Consultar alarmas)
Usuario --> (Posponer alarma)
Usuario --> (Detener alarma)
Usuario --> (Configurar repetición semanal)
Usuario --> (Resolver reto matemático)

(Posponer alarma) ..> (Alarma sonando) : <<extend>>
(Detener alarma) ..> (Resolver reto matemático) : <<include>>
```

## Explicación del diseño

El sistema se basa en un único actor: el usuario.

Los casos de uso principales representan la gestión completa de alarmas.

### Relaciones importantes:

- **extend**: Posponer alarma solo ocurre cuando la alarma está sonando.
- **include**: Detener alarma incluye el reto matemático como requisito obligatorio en el sistema.

Este diseño permite modelar correctamente el comportamiento real de un despertador inteligente moderno.
