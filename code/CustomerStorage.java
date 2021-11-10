class CustomerStorage {
  private final Map<Long, Customer> customers = new HashMap<>();
  
  Collection<? extends Customer> getAllCustomers() { return customers.valueSet(); }
  
  Customer createCustomer(long id, String name) {
    var customer = new Customer(id, name);
    customers.put(id, customer);
    return customer;
  }
  
  Optional<Customer> getCustomerById(long id) { return Optional.ofNullable(customers.get(id)); }
  
  Customer replaceCustomer(Customer novel) { /* ... */ }
  
  Optional<Customer> removeCustomerById(long id) { /* ... */ }
}
