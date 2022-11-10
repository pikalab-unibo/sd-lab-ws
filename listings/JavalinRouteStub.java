server.httpMethod("/path/to/:resourceId", this::onHttpMethod);

private void onHttpMethodStub(Context ctx) throws Exception {
  String resourceId = ctx.pathParam("resourceId");
  String param = ctx.queryParam("param");
  // automatically throws BadRequestResponse if not Integer
  var intParam = ctx.queryParam("intParam", Integer.class).get(); 
  String body = ctx.body();

  if (param == null || intParam == null || body == null)
    throw new BadRequestResponse("Missing request field");

  try {
    String inputMimeType = ctx.contentType();
    var bodyValue = deserialise(body, inputMimeType, TYPE_1.class);
  } catch (/* some deserialisazion error */) {
    throw new BadRequestResponse("Cannot deserialise body");
  }

  var outputMimeType = selectAcceptableType(ctx.header("Accept"));

  CompletableFuture<TYPE_2> asyncResult = 
    computeResultAsync(resourceId, queryParam, intQueryParam, bodyValue)
      .thenApply(result -> serialise(result, outputMimeType));
  
  ctx.contentType(outputMimeType);
  ctx.future(() -> 
        asyncResult.thenAccept(result -> ctx.body(result))
     );
}