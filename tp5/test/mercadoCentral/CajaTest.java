package mercadoCentral;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest{
    
    private Caja caja1;
    private Producto arroz;
    private Producto leche;
    private Producto azucar;
    private Producto carne;
    
    
    @BeforeEach
    public void setUp() {
        caja1 = new Caja();
        arroz = new ProductoCoop(100d, 10);
        leche = new ProductoTrad(200d,0);
        azucar = new ProductoTrad(300d, 5); 
        carne = new ProductoTrad(1000d, 2);
        
    }
     
     
    @Test
    void intentaComprarLeche() {
        IllegalArgumentException excepcion = assertThrows( IllegalArgumentException.class, () -> caja1.registrarProducto(leche));
        assertEquals("No hay stock del producto", excepcion.getMessage());
    }
    @Test
    void stockCambia() {
        caja1.registrarProducto(arroz);
        caja1.registrarProducto(arroz);
        caja1.registrarProducto(arroz);
        caja1.registrarProducto(azucar);
        caja1.registrarProducto(carne);
        
        assertEquals(7,arroz.getStock());
        assertEquals(4,azucar.getStock());
        assertEquals(1,carne.getStock());    
    }
    @Test
    void subeStock() {
        arroz.incrementarStock();
        assertEquals(arroz.getStock(), 11);
    }
    @Test
    void totalCaja(){
    	caja1.registrarProducto(arroz);
        caja1.registrarProducto(arroz);
        caja1.registrarProducto(arroz);
        caja1.registrarProducto(azucar);
        caja1.registrarProducto(carne);
        assertEquals(1570d,caja1.montoTotal());
        caja1.limpiarCaja();
        assertEquals(0,caja1.montoTotal());
        
    }
     
    
}