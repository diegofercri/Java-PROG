/*
 * Programa las clases necesarias para la gestión de una Tienda. Vamos a simular el trabajo de venta
 * y gestión de productos a través de varias clases.
 * 
 * Explicación del funcionamiento de cada clase:
 * 
 * Clase Producto, contiene la información de cada producto de la tienda. El atributo cantidad indica
 * cuantos productos tenemos en la tienda y el mínimo la cantidad mínima que debemos tener almacenada.
 * Debe contener: 
 *      - Constructores.
 *      - Métodos get y set necesarios.
 * 
 * Clase Stock. Es el conjunto de todos los productos de la tienda. Gestiona todos los productos y tiene
 * los métodos necesarios para ello. Debe contener:
 *      - Constructor vacío.
 *      - Métodos básicos de añadir, borrar y buscar productos.
 *      - Método productosAgotados() que nos retorna la lista de productos que están agotados actualmente.
 *      - Método productosBajoMinimos() que retorna la lista de productos de los cuales la cantidad
 *        almacenada en tienda es inferior al mínimo que debemos tener.
 * 
 * Clase Factura. Es la clase que representa a la factura que entregamos cada vez que algún cliente realiza
 * una compra. Contiene los atributos básicos de una factura, y una lista de líneas de factura.
 * Debe contener:
 *      - Constructores.
 *      - Métodos get y set necesarios.
 * 
 * Clase LineaFactura. Representa cada una de las líneas de una Factura. Contiene la información de
 * producto, cantidad y precio. Debe contener los métodos:
 *      - Constructores.
 *      - Métodos get y set necesarios.
 * 
 * Clase CajonFacturas. Es el lugar donde se almacenan todas las facturas de la tienda. Contiene una
 * lista de objetos Factura. Debe contener los métodos:
 *      - Constructor vació.
 *      - Métodos añadir, buscar.
 *      - Método que retorna una lista con las facturas que todavía no se han cobrado.
 */
package tienda;

public class Tienda {
    
}