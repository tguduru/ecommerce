package io.tguduru.spring.cloud.order.resource;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import io.tguduru.spring.cloud.order.dao.OrderDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
@RestController
@RequestMapping(value = "/order")
public class OrderResource {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = {"application/json"})
    public OrderDAO getOrderDetails(@PathParam("id") final Long id){
        Preconditions.checkNotNull(id,"order id is null");
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.setId(id).setQuantity(50l).setTotalPrice(250.25).setProducts(Lists.newArrayList(1l,2l,3l));
        return orderDAO;
    }
}
