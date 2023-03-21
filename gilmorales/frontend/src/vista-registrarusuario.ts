import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

@customElement('vista-registrarusuario')
export class VistaRegistrarusuario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout">
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; margin: var(--lumo-space-s);" id="vaadinButton">
   <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
  </vaadin-button>
<<<<<<< HEAD
  <vaadin-text-field placeholder="Search" style="flex-grow: 1; margin: var(--lumo-space-m);" id="vaadinTextField">
=======
  <vaadin-text-field placeholder="Search" style="margin: var(--lumo-space-m); flex-grow: 1;" id="vaadinTextField">
>>>>>>> branch 'main' of git@github.com:jmn034-ual/GilMorales.git
   <iron-icon icon="lumo:search" slot="prefix" id="ironIcon1"></iron-icon>
  </vaadin-text-field>
  <vaadin-button style="flex-grow: 1; margin: var(--lumo-space-m);" id="vaadinButton1">
    Inicio 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); flex-grow: 1;" id="vaadinButton2">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); align-self: flex-start; flex-grow: 1;" id="vaadinButton3">
    Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-xl);" id="vaadinHorizontalLayout1">
  <label id="label">Registrarse en la web</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 70%; align-self: center; flex-grow: 0; flex-shrink: 1;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout2">
   <label style="width: 20%; align-self: center;" id="label1">Nombre:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField1"></vaadin-text-field>
<<<<<<< HEAD
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout3">
   <label style="width: 20%; align-self: center;" id="label2">Apellidos:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField2"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout4">
   <label style="width: 20%; align-self: center;" id="label3">Email:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField3"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout5">
   <label style="width: 20%; align-self: center;" id="label4">Contraseña:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField4"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout6">
   <label style="width: 20%; align-self: center;" id="label5">Confirmar:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField5"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout7">
   <label style="width: 20%; align-self: center;" id="label6">Descripción:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField6"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout8">
   <label style="width: 20%; align-self: center;" id="label7">Nombre de usuario:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField7"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout9">
   <label style="width: 15%; align-self: center;" id="label8">Fecha de naciemiento:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
=======
>>>>>>> branch 'main' of git@github.com:jmn034-ual/GilMorales.git
  </vaadin-horizontal-layout>
<<<<<<< HEAD
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout10">
   <label style="width: 75%;" id="label9">Tipo de usuario:</label>
   <vaadin-radio-group value="foo" style="width: 100%;" id="vaadinRadioGroup">
    <vaadin-radio-button name="foo" tabindex="-1" id="vaadinRadioButton">
      Normal 
    </vaadin-radio-button>
    <vaadin-radio-button name="bar" tabindex="-1" id="vaadinRadioButton1">
      Comercial 
    </vaadin-radio-button>
   </vaadin-radio-group>
=======
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout3">
   <label style="width: 20%; align-self: center;" id="label2">Apellidos:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField2"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout4">
   <label style="width: 20%; align-self: center;" id="label3">Email:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField3"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout5">
   <label style="width: 20%; align-self: center;" id="label4">Contraseña:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField4"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout6">
   <label style="width: 20%; align-self: center;" id="label5">Confirmar:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField5"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout7">
   <label style="width: 20%; align-self: center;" id="label6">Descripción:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField6"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout8">
   <label style="width: 20%; align-self: center;" id="label7">Nombre de usuario:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField7"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout9">
   <label style="width: 20%; align-self: center;" id="label8">Fecha de naciemiento:</label>
   <vaadin-text-field style="width: 100%;" id="vaadinTextField8"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout10">
   <label style="width: 40%;" id="label9">Tipo de usuario:</label>
   <vaadin-checkbox id="vaadinCheckbox">
    Normal
   </vaadin-checkbox>
   <vaadin-checkbox id="vaadinCheckbox1" style="flex-grow: 0;">
    Comercial
   </vaadin-checkbox>
>>>>>>> branch 'main' of git@github.com:jmn034-ual/GilMorales.git
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout11">
   <vaadin-button style="flex-grow: 1; width: 100%;" id="vaadinButton4">
     Subir fotografía 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="align-self: center; flex-grow: 0; margin: var(--lumo-space-l); width: 30%;" id="vaadinHorizontalLayout12">
  <vaadin-button style="flex-grow: 1; width: 100%;" id="vaadinButton5">
    Descartar 
  </vaadin-button>
  <vaadin-button style="width: 100%;" id="vaadinButton6">
    Confirmar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
