package de.pikerando.backend.ordermanagement.service.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import de.pikerando.api.OrdersApiDelegate;
import de.pikerando.model.OrderTo;

/**
 * Implementation of {@link OrdersApiDelegate}.
 */
@Service
public class OrdersApiDelegateImpl implements OrdersApiDelegate {

  @Override
  public ResponseEntity<List<OrderTo>> listOrders(Integer limit) {

    return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);

  }

}
