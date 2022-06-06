import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : this.cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int caixasRemovidas = 0;
        for (Iterator<PedidoCookie> iteratorCookies = this.cookies.iterator(); iteratorCookies.hasNext(); ) {
            PedidoCookie pedido = iteratorCookies.next();
            if (pedido.getSabor().equals(sabor)) {
                caixasRemovidas += pedido.getQuantidadeCaixas();
                iteratorCookies.remove();
            }
        }
        return caixasRemovidas;
    }

}
