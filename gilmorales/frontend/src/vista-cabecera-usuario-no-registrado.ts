import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera-usuario-no-registrado')
export class VistaCabeceraUsuarioNoRegistrado extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%;background-color: #fdfd96;">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; margin: var(--lumo-space-l);">
  <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0;background-color: transparent;">
   <iron-icon id="iconoWeb" style="width: 1px; height: 1px;"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="cabecera" style="align-self: center; justify-content: space-around; flex-grow: 0; height: 40%; margin: var(--lumo-space-xs); width: 100%;">
  <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 40%; height: 50%;">
   <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
   <vaadin-button id="botonBuscar">
     Buscar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="inicio">
    Inicio 
  </vaadin-button>
  <vaadin-button id="vaadinButton">
    Iniciar Sesión 
  </vaadin-button>
  <vaadin-button id="botonCerrarSesion">
    Registrarse 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
