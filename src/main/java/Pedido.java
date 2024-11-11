import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private String status;

    public Pedido() {
        List<ItemPedido> itens = new ArrayList<>();
        Date dataPedido = new Date();
        double valorTotal = 0.0;
        this.status = "Pendente"; // Status inicial
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
