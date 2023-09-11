package ra.md5_session6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import ra.md5_session6.model.Cart;
import ra.md5_session6.model.Order;


@Controller
public class ShoppingCartController {
    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }

    @GetMapping("/shopping-cart")
    public ModelAndView showCart (@SessionAttribute("cart") Cart cart){
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }

    @GetMapping("/payment")
    public String payment(@SessionAttribute("cart") Cart cart,Model model){
        Order order = new Order();
        order.copyCart(cart.getProducts());
        order.setTotal(cart.countTotalPayment());
        model.addAttribute("order", order);
        cart.clearCart();
        return "orderDetail";
    }
}
