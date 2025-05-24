# Registro de ventas en un comercio

Queremos hacer un programa para registrar las ventas realizadas en un comercio durante un día.

## Cada venta tiene:
- Número de venta (int)
- Cliente (String)
- Importe (double)
- Medio de pago (String → puede ser "Efectivo", "Tarjeta" o "Transferencia")

## El programa debe permitir:

- Registrar todas las ventas leyendo desde un archivo (ventas.txt).
- Calcular y mostrar:
  - El total de ventas realizadas.
  - El total recaudado.
  - El total recaudado por cada medio de pago.
- Mostrar las ventas de un cliente específico ingresado por teclado.

### Bonus (opcional para alumnos avanzados)
- Mostrar cuál fue la venta de mayor importe.
- Calcular el promedio por medio de pago.

---
📄 Ejemplo de archivo ventas.txt
~~~
1,Ana,500.50,Efectivo
2,Juan,1200.00,Tarjeta
3,Ana,300.00,Transferencia
4,Carlos,1500.00,Efectivo
5,Juan,700.00,Tarjeta
~~~
