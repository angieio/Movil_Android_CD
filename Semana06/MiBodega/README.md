## MiBodeja - Fase 1 sin IA

**Estudiante: Angieluz Vasquez Macalupu**

## Preguntas:
**¿Por qué Producto.kt y MainActivity.kt se entregaron completos, y las pantallas no? ¿Qué tienen en común los archivos que sí se dejaron como esqueleto?**

Porque Producto.kt y MainActivity.kt ya tenían una estructura base que no necesitaba tantos cambios. En cambio, las pantallas se dejaron como esqueleto para que nosotros completemos la interfaz y la navegación. Los archivos que estaban como esqueleto tenían principalmente la estructura inicial de las funciones y faltaba completar su funcionamiento.

**¿Cómo lograste que el filtro de categoría (LazyRow) y el cálculo del carrito reaccionen automáticamente sin que tú "actualices" nada a mano?**

Se logró usando estados de Compose con remember y mutableStateOf. Cuando cambia la categoría seleccionada o la cantidad de productos del carrito, Compose detecta el cambio y vuelve a mostrar la parte de la pantalla que depende de ese dato automáticamente.

**¿Qué diferencia notaste entre navigate() normal (Inicio → Detalle) y el que usa popUpTo (Datos de entrega → Confirmación)?**

Con navigate() normal se agrega la nueva pantalla a la navegación, por eso puedo regresar a la pantalla anterior. Con popUpTo puedo quitar pantallas anteriores de la pila de navegación. En el caso de la confirmación sirve para evitar que el usuario vuelva a las pantallas del pedido después de confirmarlo.

**¿Qué tuviste que corregir del código que te generó la IA para el buscador en tiempo real?**

Tuve que revisar el código porque la IA podía cambiar partes que ya tenía funcionando. Corregí el filtro para que la búsqueda y la categoría funcionen juntas y no que un filtro reemplace al otro. También revisé que la lista de productos se actualice mientras escribo en el buscador.

**Compara el NavigationDrawer del Laboratorio 6 con el NavigationBar de esta tarea: ¿en qué caso usarías cada uno en un proyecto propio?**

El NavigationDrawer lo usaría cuando tengo varias opciones de navegación y quiero mostrarlas en un menú lateral. El NavigationBar lo usaría cuando tengo pocas opciones principales y quiero que estén visibles en la parte inferior de la pantalla, como en esta aplicación con Inicio y Carrito.

## Capturas del resultado:

<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/73db257c-0c74-4a76-92b0-83c715305353" width="250"></td>
    <td><img src="https://github.com/user-attachments/assets/e146c66d-cfde-4bf2-8cb8-4362b6c15b12" width="250"></td>
    <td><img src="https://github.com/user-attachments/assets/29909857-e077-431f-96db-cc63d590c04d" width="250"></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/14ce35e3-d048-4bcf-9195-6e83b8925e70" width="250"></td>
    <td><img src="https://github.com/user-attachments/assets/9820f6c2-0ebf-4b61-ae80-165b3af30d60" width="250"></td>
    <td><img src="https://github.com/user-attachments/assets/c89ab027-b1d9-44fb-90e4-f623bba133f5" width="250"></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/134b64f0-0669-4e30-a475-48f74ea7e52c" width="250"></td>
    <td><img src="https://github.com/user-attachments/assets/02484f19-1550-42da-b358-b9d07cf7594e" width="250"></td>
    <td></td>
  </tr>
</table>

## Requerimientos funcionales:

**Registro de usuarios**: El sistema debe permitir al usuario registrarse ingresando nombre, teléfono, dirección y referencia.

**Inicio de sesión:** El sistema debe permitir al usuario iniciar sesión mediante correo electrónico y contraseña.

**Visualización de productos:** El sistema debe mostrar los productos disponibles con su imagen, nombre, presentación y precio.

**Filtrado por categorías:** El sistema debe permitir filtrar los productos mediante categorías.

**Visualización del detalle:** El sistema debe mostrar la información completa de un producto seleccionado.

**Selección de cantidad:** El sistema debe permitir aumentar o disminuir la cantidad de productos antes de agregarlos al carrito.

**Gestión del carrito:** El sistema debe permitir agregar, eliminar, aumentar y disminuir productos del carrito.

**Cálculo del total:** El sistema debe calcular automáticamente el subtotal, delivery y total a pagar.

**Registro de datos de entrega:** El sistema debe permitir ingresar y verificar los datos necesarios para realizar la entrega.

**Selección del método de pago:** El sistema debe permitir seleccionar entre efectivo, Yape o Plin.
**Confirmación del pedido:** El sistema debe mostrar una pantalla de confirmación con el resumen del pedido y los datos de entrega.
**Finalización del pedido:** El sistema debe permitir regresar al inicio y vaciar el carrito después de confirmar el pedido.
