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
