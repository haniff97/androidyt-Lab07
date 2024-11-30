package com.haniff.lab07

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haniff.lab07.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Retrieve data from MainActivity
        val name = intent.getStringExtra("name")
        binding.nameTextView.text = name

        val address = intent.getStringExtra("address")
        binding.addressTextView.text = address

        val city = intent.getStringExtra("city")
        binding.cityTextView.text = city

        val province = intent.getStringExtra("province")
        binding.provinceTextView.text = province

        val postcode = intent.getStringExtra("postcode")
        binding.postcodeTextView.text = postcode

        val country = intent.getStringExtra("country")
        binding.countryTextView.text = country

        // Set up button click listeners
        binding.ConfirmBtn.setOnClickListener {
            val intent = Intent(this, Confirm::class.java)
            startActivity(intent)
        }

        binding.cancelBtn.setOnClickListener {
            finish()
        }
    }
}
