package com.bukalapak.android.justkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var quantity = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener {
            submitOrder(btnOrder)
        }
    }

    /**
     * This method is called when the plus button is clicked.
     */
    fun increment(view: View) {
        if (quantity == 100) {
            return
        }
        quantity += 1
        displayQuantity(quantity)
    }

    /**
     * This method is called when the minus button is clicked.
     */
    fun decrement(view: View) {
        if (quantity == 0) {
            return
        }
        quantity -= 1
        displayQuantity(quantity)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        // Get user's name
        val nameEditable = etName.text
        val name = nameEditable.toString()

        // Figure out if the user wants whipped cream topping
        val hasWhippedCream = false // TODO: grab the value from checkbox whipped cream

        // Figure out if the user wants choclate topping
        val hasChocolate = false // TODO: grab the value from checkbox chocolate

        // Calculate the price
        val price = calculatePrice(hasWhippedCream, hasChocolate)

        // Display the order summary on the screen
        val message = createOrderSummary(name, price, hasWhippedCream, hasChocolate)

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        // TODO: tampilkan order summary di tvOrderSummary
    }

    /**
     * Calculates the price of the order.
     *
     * @param addWhippedCream is whether or not we should include whipped cream topping in the price
     * @param addChocolate    is whether or not we should include chocolate topping in the price
     * @return total price
     */
    private fun calculatePrice(addWhippedCream: Boolean, addChocolate: Boolean): Int {
        // First calculate the price of one cup of coffee
        var basePrice = 5
        basePrice = 10

        // If the user wants whipped cream, add $1 per cup
        if (addWhippedCream) {
            basePrice = basePrice + 1
        }

        // If the user wants chocolate, add $2 per cup
        if (addChocolate) {
            basePrice = basePrice + 2
        }

        // Calculate the total order price by multiplying by the quantity
        return quantity * basePrice
    }

    /**
     * Create summary of the order.
     *
     * @param name            on the order
     * @param price           of the order
     * @param addWhippedCream is whether or not to add whipped cream to the coffee
     * @param addChocolate    is whether or not to add chocolate to the coffee
     * @return text summary
     */
    private fun createOrderSummary(name: String, price: Int, addWhippedCream: Boolean,
                                   addChocolate: Boolean): String {
        // TODO: buat order summary di sini
        return ""
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun displayQuantity(numberOfCoffees: Int) {
        // TODO: display the number of coffees in tvQuantity
    }
}
