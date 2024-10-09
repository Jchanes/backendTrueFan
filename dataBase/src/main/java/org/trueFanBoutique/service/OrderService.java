package org.trueFanBoutique.service;
import java.util.ArrayList;
import java.util.List;

import org.trueFanBoutique.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private static final ArrayList<Order> lista = new ArrayList<Order>();
    
    public OrderService () {
    	lista.add(new Order("2024-10-10", true ,Long.valueOf(5477884), Long.valueOf(48451145)));
    	
    	lista.add(new Order("2024-11-15", false,Long.valueOf(1578454), Long.valueOf(1154452)));
    	
    	lista.add(new Order("2024-12-06", true,Long.valueOf(58785418), Long.valueOf(548855)));
    }//constructor
    
    public List<Order> getAllOrder() {
		return lista;
		
	}//getAllOrders

	public Order getOrder(Long orderId) {
		Order ord = null;
		for (Order order: lista) {
			if (order.getId()== orderId) {
				ord=order;
				break;
			}//if
		}//forEach
		return ord;
	}//getOrder
	
	public Order addOrder(Order order) {
		lista.add(order);
		return order;
		
	}//addOrder
	
	public Order deleteOrder(Long orderId) {
		Order ord = null;
		for (Order order : lista) {
			if (order.getId()== orderId) {
				ord=lista.remove(lista.indexOf(order));
				break;
			}//if
		}//forEach
		return ord;
	}//deleteOrder

	public Order updateOrder(Long orderId) {
		Order ord = null;
	    for (Order order : lista) {
	        if (order.getId()==orderId) { 
	            order.setOrderStatus(!order.getOrderStatus());;
	            break;
	        }
	    }
	    return ord; //si no se encuentra la orden
	}
	
}//class OrderService 
