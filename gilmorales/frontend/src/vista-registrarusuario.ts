import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; margin: var(--lumo-space-s);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="margin: var(--lumo-space-m); flex-grow: 1;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button style="flex-grow: 1; margin: var(--lumo-space-m);">
    Inicio 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); flex-grow: 1;">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); align-self: flex-start; flex-grow: 1;">
    Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-xl);">
  <label>Registrarse en la web</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 70%; align-self: center; flex-grow: 0; flex-shrink: 1;">
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Nombre:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Apellidos:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Email:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Contraseña:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Confirmar:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Descripción:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 20%; align-self: center;">Nombre de usuario:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;">
   <label style="width: 15%; align-self: center;">Fecha de naciemiento:</label>
   <vaadin-text-field style="width: 100%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;">
   <label style="width: 75%;">Tipo de usuario:</label>
   <vaadin-radio-group value="foo" style="width: 100%;">
    <vaadin-radio-button name="foo" tabindex="-1">
     Normal
    </vaadin-radio-button>
    <vaadin-radio-button name="bar" tabindex="-1">
     Comercial
    </vaadin-radio-button>
   </vaadin-radio-group>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <vaadin-button style="flex-grow: 1; width: 100%;">
    Subir fotografía
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="align-self: center; flex-grow: 0; margin: var(--lumo-space-l); width: 30%;">
  <vaadin-button style="flex-grow: 1; width: 100%;">
   Descartar
  </vaadin-button>
  <vaadin-button style="width: 100%;">
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
