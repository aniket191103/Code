const loginForm = document.getElementById("loginForm");
const username = document.getElementById("username");
const password = document.getElementById("password");
const captchaText = document.getElementById("captchaText");
const captchaInput = document.getElementById("captchaInput");
const usernameError = document.getElementById("usernameError");
const passwordError = document.getElementById("passwordError");
const captchaError = document.getElementById("captchaError");

function generateCaptcha() {
	const R1 = Math.floor(Math.random() * 10);
	const R2 = Math.floor(Math.random() * 10);
	captchaText.textContent = `${R1} + ${R2}`;
	return R1 + R2;
}

let captchaResult = generateCaptcha();

loginForm.addEventListener("submit", (e) => {
	e.preventDefault();

	let isValid = true;

	if (!/^[a-zA-Z]+$/.test(username.value) || username.value.length > 25) {
		usernameError.textContent = "Invalid username";
		isValid = false;
	} else {
		usernameError.textContent = "";
	}

	if (!/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\-=[\]{};':"\\|,.<>/?]).{6,}/.test(password.value)) {
		passwordError.textContent = "Invalid password";
		isValid = false;
	} else {
		passwordError.textContent = "";
	}

	if (captchaInput.value != captchaResult) {
		captchaError.textContent = "Invalid captcha";
		isValid = false;
		captchaResult = generateCaptcha();
		captchaInput.value = "";
	} else {
		captchaError.textContent = "";
	}

	if (isValid) {
		alert("Form submitted successfully!");
		// You can add your form submission logic here
	}
});