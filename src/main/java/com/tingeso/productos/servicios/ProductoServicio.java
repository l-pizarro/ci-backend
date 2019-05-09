package com.tingeso.productos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.lang.Iterable;
import java.util.Optional;
import com.tingeso.productos.entidades.Producto;
import com.tingeso.productos.repositorios.ProductoRepository;

@RestController
@RequestMapping(path="/productos")
@CrossOrigin(origins = "http://157.230.12.110:8082/")
public class ProductoServicio {

	@Autowired
    private ProductoRepository productoRepository;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody Iterable<Producto> getAll(){
        return productoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Producto> get(@PathVariable Integer id){
        return productoRepository.findById(id);
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public @ResponseBody Optional<Producto> create(@RequestBody Producto producto){
        productoRepository.save(producto);
        return productoRepository.findById(producto.getCodigoProducto());
    }
}