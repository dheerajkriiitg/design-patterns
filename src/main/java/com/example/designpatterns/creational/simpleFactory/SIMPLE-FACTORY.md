# Simple Factory Pattern

The Simple Factory pattern is a creational design pattern that provides a simple way to create objects. It encapsulates the object creation logic, allowing the client code to create objects without knowing the details of their instantiation.

## Implementation

1. **Create a Separate Class:**
   - Create a separate class for our simple factory.

2. **Add a Method for Object Instantiation:**
   - Add a method in the factory class that returns the desired object instance.

3. **Method is Typically Static:**
   - This method is typically static and accepts parameters to decide which class to instantiate.

4. **Additional Arguments for Instantiation:**
   - Provide additional arguments if needed, which will be used to instantiate objects.

## Implementation Considerations

1. **No State Tracking in Simple Factory:**
   - The Simple Factory itself doesn't need any state tracking, so it's best to keep it as a static method.

## Pitfalls

1. **Complex Criteria for Instantiation:**
   - The criteria used by the Simple Factory to decide which class to instantiate can get complex over time.

2. **Consider Factory Method Pattern:**
   - If the instantiation criteria become complex, consider using the Factory Method design pattern for a more flexible and maintainable solution.

## UML Diagram

```plaintext
  +----------------+           +-----------------+         +----------------+
  |     Client     | --------> |  SimpleFactory  | ------->|     Vehicle    |
  +----------------+           +-----------------+         +----------------+
                                                       ________|__________
                                                      |        |          |
                                                  +------+ +------+ +------+
                                                  | Bike | | Car  | |Truck |
                                                  +------+ +------+ +------+
