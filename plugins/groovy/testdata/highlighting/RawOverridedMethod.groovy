interface Foo {
  def foo(Map<String> map)
}

class Bar implements Foo { // error: Method 'foo' is not implemented
  def foo(Map map) {}
}