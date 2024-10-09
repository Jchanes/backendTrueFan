package org.trueFanBoutique.service;
import java.util.ArrayList;
import java.util.List;

import org.generation.ecommerce.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private static final ArrayList<Order> lista = new ArrayList<Order>();
    
    public OrderService () {
    	lista.add(new Order ('2024-10-10', true ,Long.valuOf(5477884), Long.valueOf(48451145));
    	lista.add(new Order ('2024-11-15', false,Long.valuOf(1578454), Long.valueOf(1154452);
    	lista.add(new Order ('2024-12-06', true,Long.valuOf(58785418), Long.valueOf(548855));
    }//constructor
    
    public List<Order> getAllOrders() {
		return lista;
		
	}//getAllOrders

	public Order geOrder(Long orderId) {
		Order order = null;
		for (Order order: lista) {
			if (order.getId()== orderId) {
				orderr=order;
				break;
			}//if
		}//forEach
		return order;
	}//getOrder
	
	public Order addOrder(Order order) {
		lista.add(order);
		return order;
		
	}//addOrder
	
	public Order deleteOrder(Long orderId) {
		Order order = null;
		for (Order order : lista) {
			if (order.getId()== orderId) {
				order=lista.remove(lista.indexOf(order));
				break;
			}//if
		}//forEach
		return user;
	}//deleteOrder

	public Order updateOrder(Long orderId, boolean orderStatus) {
	    for (Order order : lista) {
	        if (order.getId().equals(orderId)) { 
	            order.setorderStatus(!=);
	            return order;
	        }
	    }
	    return null; //si no se encuentra la orden
	}
	
}//class OrderService 
