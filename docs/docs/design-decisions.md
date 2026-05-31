## Clase AlarmManager

Responsabilidad:
Gestionar todas las alarmas del sistema.

Motivos de diseño:

- Centraliza la gestión de alarmas.
- Evita que otras clases manipulen directamente la colección.
- Facilita futuras ampliaciones como detección de conflictos o consulta de próximas alarmas.

## Repetición semanal

Se ha utilizado `Set<DayOfWeek>` porque:

- Evita duplicados automáticamente.
- Permite consultas rápidas.
- Es flexible para cualquier combinación de días.

Alternativa descartada:
- boolean por cada día → poco escalable.
