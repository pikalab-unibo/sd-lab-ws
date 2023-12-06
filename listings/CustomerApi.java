interface CustomerApi {
  CompletableFuture<List<Customer>> getAllConstumers(); 
  CompletableFuture<Customer> getCustumerByID(long id);
  CompletableFuture<Customer> getCustumerByName(String name);
  CompletableFuture<Customer> addCustumer(Customer newCustomer);
  CompletableFuture<Boolean> updateCustomer(long id, Customer newInfo);
  CompletableFuture<Boolean> deleteCustomer(long id);
}