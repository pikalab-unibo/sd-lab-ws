interface CustomerController {
  // GET /customers
  void getAll(Context ctx) throws HttpResponseException;
  
  // GET /customers/:identifier
  void get(Context ctx) throws HttpResponseException;  
    
  // POST /customers/
  void post(Context ctx) throws HttpResponseException;   
  
  // PUT /customers/:identifier
  void put(Context ctx) throws HttpResponseException;   
   
  // DELETE /customers/:identifier
  void delete(Context ctx) throws HttpResponseException; 
}
