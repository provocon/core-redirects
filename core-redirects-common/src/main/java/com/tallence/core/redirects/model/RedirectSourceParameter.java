package com.tallence.core.redirects.model;

public class RedirectSourceParameter extends RedirectParameter {

  private final RedirectSourceParameter.Operator operator;

  public RedirectSourceParameter(String name, String value, Operator operator) {
    super(name, value);
    this.operator = operator;
  }

  public Operator getOperator() {
    return operator;
  }

  /**
   * Currently there is only the operator {@link RedirectSourceParameter.Operator#EQUALS} support. With this operator
   * every configured parameter must be set exactly at the request. In the future this could be extended by contains or
   * starts with as an operator type.
   */
  public enum Operator {
    EQUALS;
  }
}