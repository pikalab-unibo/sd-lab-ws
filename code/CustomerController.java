interface CustomerController {
  // GET /customers
  void getAll(Context ctx) throws Exception;
  // GET /customers/:identifier
  void get(Context ctx) throws Exception;    
  // POST /customers/
  void post(Context ctx) throws Exception;   
  // PUT /customers/:identifier
  void put(Context ctx) throws Exception;    
  // DELETE /customers/:identifier
  void delete(Context ctx) throws Exception; 
}