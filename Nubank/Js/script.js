document.querySelector('.hide-values').addEventListener('click', function() {
    var balances = document.querySelectorAll('.balance');
    11
    balances.forEach(function(balance) {
        var currentValue = balance.textContent.trim();
        if(currentValue.includes("*")){
            balance.textContent = balance.getAttribute('data-original-value');
        } else{
            balance.setAttribute('data-original-value', currentValue);
        
        var hiddenValue = '*'.repeat(currentValue.length);
        balance.textContent = hiddenValue;
        }    
    });
});