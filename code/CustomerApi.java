interface CustomerApi {
  CompletableFuture<List<Customer>> getAll(); 
  CompletableFuture<Customer> get(long id);
  CompletableFuture<Customer> get(String name);
  CompletableFuture<Customer> post(Customer newCustomer);
  CompletableFuture<Boolean> put(long id, Customer newInfo);
  CompletableFuture<Boolean> delete(long id);
}