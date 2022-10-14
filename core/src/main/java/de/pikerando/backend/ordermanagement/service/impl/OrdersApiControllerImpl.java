package de.pikerando.backend.ordermanagement.service.impl;

import org.springframework.stereotype.Controller;

import de.pikerando.api.OrdersApi;
import de.pikerando.api.OrdersApiController;
import de.pikerando.api.OrdersApiDelegate;

/**
 * Controller for {@link OrdersApi} (reusing the generated {@link OrdersApiController}).
 */
@Controller
public class OrdersApiControllerImpl extends OrdersApiController {

  /**
   * The constructor.
   *
   * @param delegate
   */
  public OrdersApiControllerImpl(OrdersApiDelegate delegate) {

    super(delegate);
  }
}
