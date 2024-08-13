package com.examenfiltro.examenfiltro.region.domain.entities;

import com.examenfiltro.examenfiltro.Country.domain.entities.Country;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "region")
@Data
@AllArgsConstructor
public class Region {
    @Id
    @Column(name = "codereg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codereg;

    @Column(name="namereg")
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry", referencedColumnName = "codecountry", nullable = false)
    private Country codecountry;
}
















































// @GetMapping
    // public List<Cliente> getAllClientes() {
    //     return clienteService.findAll();
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
    //     Optional<Cliente> foundCliente = clienteService.findById(id);
    //     if (!foundCliente.isPresent()) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    //     return new ResponseEntity<>(foundCliente.orElseThrow(), HttpStatus.OK);
    // }

    // @PostMapping
    // public ResponseEntity<Cliente> createCliente(@Valid @RequestBody Cliente cliente) {
    //     clienteService.save(cliente);
    //     return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<String> updateCliente(@PathVariable Long id, @Valid @RequestBody Cliente cliente) {
    //     Optional<Cliente> foundCliente = clienteService.findById(id);
    //     if (!foundCliente.isPresent()) {
    //         return new ResponseEntity<>("Cliente no encontrado", HttpStatus.NOT_FOUND);
    //     }
    //     cliente.setId(id);
    //     clienteService.save(cliente);
    //     return new ResponseEntity<>("Cliente actualizado correctamente", HttpStatus.OK);
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteCliente(@PathVariable Long id) {
    //     Optional<Cliente> foundCliente = clienteService.findById(id);
    //     if (!foundCliente.isPresent()) {
    //         return new ResponseEntity<>("Cliente no encontrado", HttpStatus.NOT_FOUND);
    //     }
    //     clienteService.disableForeignKeyChecks();
    //     clienteService.deleteById(id);
    //     clienteService.enableForeignKeyChecks();
    //     return new ResponseEntity<>("Cliente eliminado correctamente", HttpStatus.OK);
    // }
