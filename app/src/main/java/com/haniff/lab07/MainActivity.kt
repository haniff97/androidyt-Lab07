package com.haniff.lab07

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haniff.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.scheduleBtn.setOnClickListener {
            //TODO :: Open a new page/Activity
            //to import: ALT + Enter
            val intent = Intent(this, DetailActivity::class.java)
            //Hantar nilai nameEditText.text.toString() ke DetailActivity menggunakan key "name"
            intent.putExtra("name", binding.nameEditText.text.toString())
            intent.putExtra("address", binding.addressEditText.text.toString())
            intent.putExtra("city", binding.cityEditText.text.toString())
            intent.putExtra("province", binding.providerEditText.text.toString())
            intent.putExtra("postcode", binding.postalEditText.text.toString())
            intent.putExtra("country", binding.countryEditText.text.toString())

            //execute the intent
            startActivity(intent)
        }
    }
}