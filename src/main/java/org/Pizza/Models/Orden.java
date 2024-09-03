package org.Pizza.Models;
import java.time.LocalDate;
import org.Pizza.Cliente;

public class Orden extends Identified
{
    private Long noOrden;
    private Cliente cliente;
    private LocalDate fecha;
    private Double dTotal;

    public Long getNoOrden()
    {
        return noOrden;
    }

    public void setNoOrden(Long noOrden) {
        this.noOrden = noOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getdTotal() {
        return dTotal;
    }

    public void setdTotal(Double dTotal) {
        this.dTotal = dTotal;
    }
}
