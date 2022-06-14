// 1 Class can extend another class

class Base()
{}

class Derived extends Base
{}

//////////////////////////////////////////////////////////////////////////////////////////////
// 2. One class can implement one interface
interface Demo
{}

class Hellos implements Demo
{}

//////////////////////////////////////////////////////////////////////////////////////////////
// 3. one class can implement more than one interface (Replacement for multiple inheritance)
interface Hello
{}

interface Demo
{}

class Marvellous implements Hello, Demo
{}

/////////////////////////////////////////////////////////////////////////////////////////////
// 4. One interface can extend another interface
interface Demo
{}

interface Hello extends Demo
{}

class Marvellous implements Hello, Demo
{}

////////////////////////////////////////////////////////////////////////////////////////////
// 5. One class can extend one class and implement one interface
class Demo
{}

interface Hello
{}

class Marvellous extends Demo implements Hello
{}