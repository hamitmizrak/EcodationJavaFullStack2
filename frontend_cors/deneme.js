//Zamanın dinamik olarak alıp hangi gün olduğunu gösteren arrow function algoritmasını yazalım switch-case   new Date().getDay()
let nowDateDay = () => {
    let nowDay = new Date().getDay()

    switch (nowDay) {
        case 0:
            document.write('<br>' + 'Günlerden Pazar')
            break
        case 1:
            document.write('<br>' + 'Günlerden Pazartesi')
            break
        case 2:
            document.write('<br>' + 'Günlerden salı')
            break
        case 3:
            document.write('<br>' + 'Günlerden çarşamba')
            break
        case 4:
            document.write('<br>' + 'Günlerden Perşembe')
            break
        case 5:
            document.write('<br>' + 'Günlerden Cuma')
            break
        case 6:
            document.write('<br>' + 'Günlerden Cumartesi')
            break

        default:
            document.write('<br>' + 'Günlerden belirtilen aralıkta giriniz')
            break
    }
}

nowDateDay()