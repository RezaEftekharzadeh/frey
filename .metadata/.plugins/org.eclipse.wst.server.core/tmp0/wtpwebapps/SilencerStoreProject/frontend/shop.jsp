
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
			integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		 	crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/vue/2.4.4/vue.js"></script>




	<div class="container">
		
		
		<div class="card mb-3"  v-for="(silencer, index) in silencers"> 
			<div class="card-body" >
				<span class="float-right" style="cursor:pointer"
					@click='deleteSilencerForm(index)'>
					x
				</span>
			
		
						
				<h4 class="card-title">{{ index +1 }}</h4>
				
				<div class="silencer-form">
				
					<select name="tread" id="tread"  v-model="silencer.tread">
						 <option value="volvo">Volvo</option>
						 <option value="saab">Saab</option>
						 <option value="mercedes">Mercedes</option>
						 <option value="audi">Audi</option>
					</select>
					
					<select name="core" id="core" v-model="silencer.core" >
						 <option value="volvo">Volvo</option>
						 <option value="saab">Saab</option>
						 <option value="mercedes">Mercedes</option>
						 <option value="audi">Audi</option>
					</select>
					
					<input type="text" placeholder="total" size = "3" v-model="silencer.total">

				</div>
			</div>
		</div>
		
		<button class="btn btn-success mt-5 mb-5" 
			@click="addNewForm">
			New Form
		</button>
		
	</div>
	
	<script>
	
		var app = new Vue({
			el: '.container',
			data: {
				silencers: [
					{
						tread: '',
						core: '',
						total: ''
					}
				]
				
			},
			methods: {
				addNewForm () {
				this.silencers.push({
					tread: '',
					core: '',
					total: ''
				})
			},
		
		deleteSilencerForm (index) {
			this.silencers.splice(index, 1)
			}	
		}
	})
	
	</script>

